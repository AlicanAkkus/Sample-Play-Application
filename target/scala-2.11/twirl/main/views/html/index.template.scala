
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""


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

                        <script type="text/javascript" src=""""),_display_(/*57.62*/routes/*57.68*/.Assets.versioned("js/person.js")),format.raw/*57.101*/(""""></script>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Mar 10 22:38:44 EET 2016
                  SOURCE: /home/wora/activator-dist-1.3.7/MyApps/app/views/index.scala.html
                  HASH: 4cdf7ed0d80ed5cebb31a107e4bf036e1aaff114
                  MATRIX: 834->95|946->112|975->312|1003->314|1035->337|1075->339|1109->346|1252->462|1267->468|1311->491|2890->2043|2905->2049|2960->2082|3103->2195
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|41->15|44->18|44->18|44->18|83->57|83->57|83->57|90->64
                  -- GENERATED --
              */
          