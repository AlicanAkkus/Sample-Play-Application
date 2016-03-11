(function() {
  $.get("/getPersons", function(persons) {
    return $.each(persons, function(index, person) {
      var deleteLink;
      deleteLink = "<a href='" + "/delete/" + person.id + "' class='form-control'>Delete</a>";
      $("#personBody").append($("<tr>"));
      $("#personBody").append($("<td>").text(person.id));
      $("#personBody").append($("<td>").text(person.name));
      $("#personBody").append($("<td>").text(person.surname));
      $("#personBody").append($("<td>").text(person.gender));
      $("#personBody").append($("<td>" + deleteLink));
      return $("#personBody").append($("</tr>"));
    });
  });

}).call(this);

//# sourceMappingURL=person.js.map
