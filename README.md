# Simple-Play-Application

### Created by Wora, visit [My Blog](www.alicanakkus.com)



This file will be packaged with your application when using `activator dist`.

There are several demonstration files available in this template.

Controllers
===========

    - PersonController.java:

  Show how to handle crud operations for Person

    - HomeController.java:

  Render all person to view

Views
=====

    - index.scala.html:

  Contains list of all person and form for insert new person.

    - main.scala.html:

  Main page for application, contains index template, in other words index template call main template.


Routes
======

    - Add new person

  HTTP POST method to url /add

    - Get person

  HTTP GET method to url /getPersons

    - View all person

  HTTP GET method to url /getPersons get all person for view

    - Remove person
  HTTP GET method to url /delete/:id remove person by id

    - Remove all person
  HTTP GET method to url /removeAll remove all person
