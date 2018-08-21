
<#import "/templates/header.ftl" as h>

<#list systems as system>
        ${system_index + 1}. ${system.name} from ${system.developer}
</#list>



<#global ar = ["a","b","c"]>


${ar?size}

#{h.getArrSize()}

${repeat3("eoF_")?upper_case}


${h.yoli()}

${h.sayCrap()}

${h.pluss(3,4)}


${h.repeat3times("A_")}