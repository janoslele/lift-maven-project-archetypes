package ${package}.code.snippet

import net.liftweb.util.Helpers._

class Welcome {
  def render() = {
    "@project-name" #> "${projectName}"
  }

}