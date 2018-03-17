<!DOCTYPE html>

<html lang="en">

<body>
<#list cityList as city>
<p></p>
City: ${city.cityName}! <br><p></p>
Q:Why I like? <br><p></p>
A:${city.description}!

</#list>
</body>

</html>