package typingsSlinky.react.components

import _root_.typingsSlinky.StBuildingComponent.Default
import _root_.typingsSlinky.react.anon.Children
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StrictMode {
  
  @JSImport("react", "StrictMode")
  @js.native
  val component: js.Object = js.native
  
  type Props = Children
  
  implicit def make(companion: StrictMode.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
