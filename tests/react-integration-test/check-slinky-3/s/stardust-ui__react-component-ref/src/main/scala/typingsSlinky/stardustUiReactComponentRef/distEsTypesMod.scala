package typingsSlinky.stardustUiReactComponentRef

import _root_.typingsSlinky.react.mod.Ref
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsTypesMod {
  
  @JSImport("@stardust-ui/react-component-ref/dist/es/types", "refPropType")
  @js.native
  val refPropType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropTypes.Requireable<React.Ref<any>> */ Any = js.native
  
  trait RefProps extends StObject {
    
    var children: ReactElement
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: Ref[Any]
  }
  object RefProps {
    
    inline def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[RefProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    }
  }
}
