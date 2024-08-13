package typingsSlinky.react.components

import org.scalajs.dom.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.semanticUiReactDistCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.react.semanticUiReactDistCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.react.semanticUiReactDistCommonjsModulesAccordionAccordionPanelMod.AccordionPanelProps
import typingsSlinky.react.semanticUiReactDistCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AccordionAccordionProps2066860743[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  inline def activeIndex(value: Double | js.Array[Double]): this.type = set("activeIndex", value.asInstanceOf[js.Any])
  
  inline def activeIndexVarargs(value: Double*): this.type = set("activeIndex", js.Array(value*))
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def defaultActiveIndex(value: Double | js.Array[Double]): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
  
  inline def defaultActiveIndexVarargs(value: Double*): this.type = set("defaultActiveIndex", js.Array(value*))
  
  inline def exclusive(value: Boolean): this.type = set("exclusive", value.asInstanceOf[js.Any])
  
  inline def onTitleClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ AccordionTitleProps) => Unit): this.type = set("onTitleClick", js.Any.fromFunction2(value))
  
  inline def panels(value: SemanticShorthandCollection[AccordionPanelProps]): this.type = set("panels", value.asInstanceOf[js.Any])
  
  inline def panelsVarargs(value: SemanticShorthandItem[AccordionPanelProps]*): this.type = set("panels", js.Array(value*))
}
