
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wora/activator-dist-1.3.7/MyApps/conf/routes
// @DATE:Fri Mar 11 22:37:03 EET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
