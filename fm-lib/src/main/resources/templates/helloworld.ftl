<#import "utils.ftl" as u>
<#import "/templates/header.ftl" as hea>


<@u.page>
<p>${exampleObject.name} by ${exampleObject.developer}</p>

yoli = ${hea.yoli()}


<ul>
    <#list systems as system>
        <li>${system_index + 1}. ${system.name} from ${system.developer}</li>
    </#list>
</ul>


    <#function isDragonHere p1>
        <#return "Gragon is here! "+p1>
    </#function>

<#-- Just another example of using a macro: -->
    <@u.otherExample p1=11 p2=22 />

    <#assign var_link = "http://www.vogella.com/people/larsvogel.html">

<a href="${var_link}">About Lars Vogel</a>

<!-- Acts like if the color was N/A if there's no color: -->
<p>Color: ${color!'N/A'}</p>

<!-- Avoid the whole color row if there's no color: -->
    <#if color??>
    <p>Color: ${color}</p>
    </#if>

    <#assign user = "Pupkin">
    <#assign s = "Hello ${user}!">
    ${s[2..3]}
    ${s[2..<7]}
    ${s[2..*3]}
    ${s[2..*100]}
    ${s[2..]}


    <#list ["Joe", "Fred"] + ["Julia", "Kate"] as user>
    - ${user}
    </#list>


    <#assign testString = "pupkin rrefer rf reger">


    ${testString?html}
    ${testString?upper_case?html}

    ${testString?cap_first}

    ${exampleObject.repeat("Foo", 3)}

    <#assign x = "something">
    ${indexOf("met", x)}
    ${indexOf("foo", x)}



    ${repeat3(repeat3("Xuinya")) + repeat3("Fookalomukallo")?upper_case}


    ${mouse!"No mouse."}
    <#assign mouse="Jerry">
    ${mouse!"No mouse."}

    (${mouse1!})
    <#assign mouse1 = "Jerry">
    (${mouse1!})


    <#if mouse2??>


    Mouse found
    <#else>
    No mouse found
    </#if>


Creating mouse...
    <#assign mouse2 = "Jerry">
    <#if mouse2??>
    Mouse found
    <#else>
    No mouse found
    </#if>


    <#macro something>
    ...
    </#macro>

    <#assign sellCurrency = tradeUtils("getSellCurrency","${user}")>

<h1>${sellCurrency!"No sellCurrency."}</h1>


    ${isDragonHere("T")}


    <#assign myString = "">

   myString =  ${myString!}

    <#if myString??>
    AAA
    <#else>
    BBB
    </#if>


    <#assign tt = myString??>

    ${myString?has_content?then('a','b')}




<#assign res = "dsds dsd sd sd 1:15"?matches(r"(.*) (\d+\:\d{2})")>
<#if res> <#-- Must not try to access groups if there was no match! -->
  First name: ${res?groups[1]}
  Second name: ${res?groups[2]}
</#if>


${hea.repeat3times("X_")}

</@u.page>