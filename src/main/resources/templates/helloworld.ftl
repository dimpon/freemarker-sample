<#import "utils.ftl" as u>

<@u.page>
<p>${exampleObject.name} by ${exampleObject.developer}</p>

<ul>
    <#list systems as system>
        <li>${system_index + 1}. ${system.name} from ${system.developer}</li>
    </#list>
</ul>

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



</@u.page>