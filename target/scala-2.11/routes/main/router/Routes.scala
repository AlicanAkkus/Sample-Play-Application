
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wora/activator-dist-1.3.7/MyApps/conf/routes
// @DATE:Thu Mar 17 20:20:02 EET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  PersonController_2: controllers.PersonController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    PersonController_2: controllers.PersonController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, PersonController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, PersonController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.PersonController.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPersons""", """controllers.PersonController.getPersons"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeAll""", """controllers.PersonController.removeAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """id<[^/]+>""", """controllers.PersonController.delete(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PersonController_add1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_PersonController_add1_invoker = createInvoker(
    PersonController_2.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "add",
      Nil,
      "POST",
      """ add person operation""",
      this.prefix + """add"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PersonController_getPersons2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPersons")))
  )
  private[this] lazy val controllers_PersonController_getPersons2_invoker = createInvoker(
    PersonController_2.getPersons,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """getPersons"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PersonController_removeAll3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeAll")))
  )
  private[this] lazy val controllers_PersonController_removeAll3_invoker = createInvoker(
    PersonController_2.removeAll,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "removeAll",
      Nil,
      "GET",
      """""",
      this.prefix + """removeAll"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PersonController_delete4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonController_delete4_invoker = createInvoker(
    PersonController_2.delete(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "delete",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_PersonController_add1_route(params) =>
      call { 
        controllers_PersonController_add1_invoker.call(PersonController_2.add)
      }
  
    // @LINE:10
    case controllers_PersonController_getPersons2_route(params) =>
      call { 
        controllers_PersonController_getPersons2_invoker.call(PersonController_2.getPersons)
      }
  
    // @LINE:11
    case controllers_PersonController_removeAll3_route(params) =>
      call { 
        controllers_PersonController_removeAll3_invoker.call(PersonController_2.removeAll)
      }
  
    // @LINE:12
    case controllers_PersonController_delete4_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PersonController_delete4_invoker.call(PersonController_2.delete(id))
      }
  
    // @LINE:16
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
