$.get "/allPersons", (persons) ->
  $.each persons, (index, person) ->
    $("#personBody").append $("<tr>")
    $("#personBody").append $("<td>").text person.id
    $("#personBody").append $("<td>").text person.name
    $("#personBody").append $("<td>").text person.surname
    $("#personBody").append $("<td>").text person.gender
    $("#personBody").append $("</tr>")
