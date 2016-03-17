
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

     object index_Scope1 {
import java.util

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.HashMap[Integer, Person],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(persons : util.HashMap[Integer,Person]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.42*/("""



"""),_display_(/*13.2*/main("Welcome to Play")/*13.25*/{_display_(Seq[Any](format.raw/*13.26*/("""


    """),format.raw/*16.5*/("""<div class="container">
        <div class="row">
            <div class="col-sm-6">
                <form action=""""),_display_(/*19.32*/routes/*19.38*/.PersonController.add()),format.raw/*19.61*/("""" method="post">

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

                        """),_display_(/*58.26*/for( (personId, personObject) <- persons) yield /*58.67*/{_display_(Seq[Any](format.raw/*58.68*/("""
                            """),format.raw/*59.29*/("""<tr>
                                <td>"""),_display_(/*60.38*/personId),format.raw/*60.46*/("""</td>
                                <td>"""),_display_(/*61.38*/personObject/*61.50*/.getName),format.raw/*61.58*/("""</td>
                                <td>"""),_display_(/*62.38*/personObject/*62.50*/.getSurname),format.raw/*62.61*/("""</td>
                                <td>"""),_display_(/*63.38*/personObject/*63.50*/.getGender),format.raw/*63.60*/("""</td>
                                """),_display_(/*64.34*/defining("/delete/" + personId)/*64.65*/ { deleteUrl =>_display_(Seq[Any](format.raw/*64.80*/("""
                                """),format.raw/*65.33*/("""<td><a href=""""),_display_(/*65.47*/deleteUrl),format.raw/*65.56*/("""" class='form-control'>Delete</a></td>
                                """)))}),format.raw/*66.34*/("""
                            """),format.raw/*67.29*/("""</tr>
                        """)))}),format.raw/*68.26*/("""

                    """),format.raw/*70.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>
""")))}),format.raw/*75.2*/("""
"""))
      }
    }
  }

  def render(persons:util.HashMap[Integer, Person]): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((util.HashMap[Integer, Person]) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 21:24:54 EET 2016
                  SOURCE: /home/wora/activator-dist-1.3.7/MyApps/app/views/index.scala.html
                  HASH: b17c432887499ddbfbc8e7d4e4809530fff4d53f
                  MATRIX: 813->253|948->293|979->298|1011->321|1050->322|1084->329|1227->445|1242->451|1286->474|2829->1990|2886->2031|2925->2032|2982->2061|3051->2103|3080->2111|3150->2154|3171->2166|3200->2174|3270->2217|3291->2229|3323->2240|3393->2283|3414->2295|3445->2305|3511->2344|3551->2375|3604->2390|3665->2423|3706->2437|3736->2446|3839->2518|3896->2547|3958->2578|4008->2600|4118->2680
                  LINES: 30->9|35->9|39->13|39->13|39->13|42->16|45->19|45->19|45->19|84->58|84->58|84->58|85->59|86->60|86->60|87->61|87->61|87->61|88->62|88->62|88->62|89->63|89->63|89->63|90->64|90->64|90->64|91->65|91->65|91->65|92->66|93->67|94->68|96->70|101->75
                  -- GENERATED --
              */
          