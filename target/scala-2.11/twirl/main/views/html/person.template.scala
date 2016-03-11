
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object person_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class person extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Person],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(persons : List[Person]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/display/*4.9*/(person: models.Person):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.36*/("""
    """),format.raw/*5.5*/("""<li>"""),_display_(/*5.10*/person/*5.16*/.getName()),format.raw/*5.26*/(""" """),format.raw/*5.27*/("""+ ' - ' + ("""),_display_(/*5.39*/person/*5.45*/.getSurname),format.raw/*5.56*/(""")</li>
""")))};
Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*2.1*/("""<h1>Welcome to Play!</h1>

"""),format.raw/*6.2*/("""

"""),format.raw/*8.1*/("""<ul>
"""),_display_(/*9.2*/for(person <- persons) yield /*9.24*/ {_display_(Seq[Any](format.raw/*9.26*/("""
    """),_display_(/*10.6*/display(person)),format.raw/*10.21*/("""
""")))}),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</ul>

"""))
      }
    }
  }

  def render(persons:List[Person]): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((List[Person]) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


}

/**/
object person extends person_Scope0.person
              /*
                  -- GENERATED --
                  DATE: Fri Mar 11 22:44:01 EET 2016
                  SOURCE: /home/wora/activator-dist-1.3.7/MyApps/app/views/person.scala.html
                  HASH: c7ec26fa7c1d703bbb18251cff98ba6f1e50d315
                  MATRIX: 753->1|855->54|869->61|972->88|1003->93|1034->98|1048->104|1078->114|1106->115|1144->127|1158->133|1189->144|1236->25|1263->26|1316->152|1344->154|1375->160|1412->182|1451->184|1483->190|1519->205|1551->207|1579->208
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|34->5|34->5|34->5|34->5|36->1|37->2|39->6|41->8|42->9|42->9|42->9|43->10|43->10|44->11|45->12
                  -- GENERATED --
              */
          