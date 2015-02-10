package bootstrap.liftweb

import net.liftweb.http.LiftRules
import net.liftmodules.FoBo

/**
 * A class that's instantiated early and run.
 * 
 * It allows the application to modify lift's environment.
 * 
 * Note: must be in package bootstrap.liftweb
 * 
 */
class Boot {
  def boot {
    // where to search snippet
    LiftRules.addToPackages("${package}.code")

    // Force the request to be UTF-8
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))
    
    FoBo.InitParam.JQuery = FoBo.JQuery1111
    FoBo.InitParam.ToolKit = FoBo.Bootstrap320
    
    FoBo.init()
    
  }
}