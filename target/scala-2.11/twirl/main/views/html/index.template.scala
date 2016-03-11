
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Person],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * Call the the `main` template with two arguments. The first
 * argument is a `String` with the title of the page, the second
 * argument is an `Html` object containing the body of the page.

@main("Welcome to Play")("Testtt")
*/
  def apply/*8.2*/(persons : List[Person]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.26*/("""



"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/{_display_(Seq[Any](format.raw/*12.26*/("""


    """),format.raw/*15.5*/("""<div class="container">
        <div class="row">
            <div class="col-sm-6">
                <form action=""""),_display_(/*18.32*/routes/*18.38*/.PersonController.add()),format.raw/*18.61*/("""" method="post">

                    <div class="form-group">
                        <label for="id">ID</label>
                        <input type="text" name="id" id="id" class="form-control" />
                    </div>
                    <div>
                        <label for="name">NAME</label>
                        <input type="text" name="name" id="name" class="form-control" />
                    </div>
                    <div>
                        <label for="surname">SURNAME</label>
                        <input type="text" name="surname" id="surname" class="form-control" />
                    </div>
                    <div>
                        <label for="gender">GENDER</label>
                        <input type="text" name="gender" id="gender" class="form-control"/>

                    </div>

                    <div>
                        <button type="submit" class="btn btn-default">Add Person</button>
                    </div>

                </form>
            </div>
            <div class="col-sm-6">
                <table class="table table-responsive">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                            <th>SURNAME</th>
                            <th>GENDER</th>
                            <th>ACTION</th>
                        </tr>
                    </thead>
                    <tbody id="personBody">

                        """),_display_(/*57.26*/for(person <- persons) yield /*57.48*/{_display_(Seq[Any](format.raw/*57.49*/("""
                            """),format.raw/*58.29*/("""<td>"""),_display_(/*58.34*/person/*58.40*/.getId),format.raw/*58.46*/("""</td>
                            <td>"""),_display_(/*59.34*/person/*59.40*/.getName),format.raw/*59.48*/("""</td>
                            <td>"""),_display_(/*60.34*/person/*60.40*/.getSurname),format.raw/*60.51*/("""</td>
                            <td>"""),_display_(/*61.34*/person/*61.40*/.getGender),format.raw/*61.50*/("""</td>
                            """),_display_(/*62.30*/defining("/delete/" + person.getId)/*62.65*/ { deleteUrl =>_display_(Seq[Any](format.raw/*62.80*/("""
                            """),format.raw/*63.29*/("""<td><a href=""""),_display_(/*63.43*/deleteUrl),format.raw/*63.52*/("""" class='form-control'>Delete</a></td>
                            """)))}),format.raw/*64.30*/("""
                        """)))}),format.raw/*65.26*/("""

                    """),format.raw/*67.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>
""")))}),format.raw/*72.2*/("""
"""))
      }
    }
  }

  def render(persons:List[Person]): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((List[Person]) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


}

/*
 * Call the the `main` template with two arguments. The first
 * argument is a `String` with the title of the page, the second
 * argument is an `Html` object containing the body of the page.

@main("Welcome to Play")("Testtt")
*/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Mar 11 23:06:09 EET 2016
                  SOURCE: /home/wora/activator-dist-1.3.7/MyApps/app/views/index.scala.html
                  HASH: 8555a65e818dc789afd89502ca34955e84b0cb25
                  MATRIX: 980->235|1099->259|1130->264|1162->287|1201->288|1235->295|1378->411|1393->417|1437->440|2980->1956|3018->1978|3057->1979|3114->2008|3146->2013|3161->2019|3188->2025|3254->2064|3269->2070|3298->2078|3364->2117|3379->2123|3411->2134|3477->2173|3492->2179|3523->2189|3585->2224|3629->2259|3682->2274|3739->2303|3780->2317|3810->2326|3909->2394|3966->2420|4016->2442|4126->2522
                  LINES: 33->8|38->8|42->12|42->12|42->12|45->15|48->18|48->18|48->18|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|89->59|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|95->65|97->67|102->72
                  -- GENERATED --
              */
          