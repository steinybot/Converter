package typingsJapgolly.react.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  object A {
    
    inline def apply(aCallback: CallbackTo[Double], aMember: Double): Default[js.Object] = {
      val __props = js.Dynamic.literal(aCallback = aCallback.toJsFn, aMember = aMember.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.react.componentstestMod.A]))
    }
    
    @JSImport("react/componentstest", "Component")
    @js.native
    val component: js.Object = js.native
    
    type Props = typingsJapgolly.react.componentstestMod.A
    
    def withProps(p: typingsJapgolly.react.componentstestMod.A): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object B {
    
    inline def apply(bMember: String): Builder = {
      val __props = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.react.componentstestMod.B]))
    }
    
    @JSImport("react/componentstest", "Component")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def bCallback(value: CallbackTo[String]): this.type = set("bCallback", value.toJsFn)
    }
    
    type Props = typingsJapgolly.react.componentstestMod.B
    
    def withProps(p: typingsJapgolly.react.componentstestMod.B): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
