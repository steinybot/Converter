package typingsSlinky.semanticUiReact.components

import _root_.typingsSlinky.StBuildingComponent
import _root_.typingsSlinky.semanticUiReact.distCommonjsElementsButtonButtonMod.ButtonProps
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import _root_.typingsSlinky.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import _root_.typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import _root_.typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import _root_.typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import _root_.typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ButtonGroupProps1675589688 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def attached(value: Boolean | left | right | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
  
  inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
  
  inline def buttons(value: SemanticShorthandCollection[ButtonProps]): this.type = set("buttons", value.asInstanceOf[js.Any])
  
  inline def buttonsVarargs(value: SemanticShorthandItem[ButtonProps]*): this.type = set("buttons", js.Array(value*))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
  
  inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
  
  inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
  
  inline def icon(value: Boolean): this.type = set("icon", value.asInstanceOf[js.Any])
  
  inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
  
  inline def labeled(value: Boolean): this.type = set("labeled", value.asInstanceOf[js.Any])
  
  inline def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
  
  inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
  
  inline def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
  
  inline def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
  
  inline def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def toggle(value: Boolean): this.type = set("toggle", value.asInstanceOf[js.Any])
  
  inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  
  inline def widths(value: SemanticWIDTHS): this.type = set("widths", value.asInstanceOf[js.Any])
}
