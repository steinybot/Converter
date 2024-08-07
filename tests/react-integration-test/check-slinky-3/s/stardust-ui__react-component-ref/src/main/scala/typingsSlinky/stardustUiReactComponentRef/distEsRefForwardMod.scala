package typingsSlinky.stardustUiReactComponentRef

import _root_.typingsSlinky.react.mod.Component
import _root_.typingsSlinky.stardustUiReactComponentRef.anon.Children
import _root_.typingsSlinky.stardustUiReactComponentRef.anon.InnerRef
import _root_.typingsSlinky.stardustUiReactComponentRef.distEsTypesMod.RefProps
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsRefForwardMod {
  
  @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", JSImport.Default)
  @js.native
  open class default () extends RefForward
  /* static members */
  object default {
    
    @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@stardust-ui/react-component-ref/dist/es/RefForward", "default.propTypes")
    @js.native
    def propTypes: Children | InnerRef = js.native
    inline def propTypes_=(x: Children | InnerRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RefForward
    extends Component[RefProps, js.Object, Any] {
    
    def handleRefOverride(node: HTMLElement): Unit = js.native
  }
}
