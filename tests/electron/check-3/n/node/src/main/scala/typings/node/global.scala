package typings.node

import _root_.typings.node.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object NodeJS {
    
    @JSGlobal("NodeJS.EventEmitter")
    @js.native
    open class EventEmitter ()
      extends StObject
         with _root_.typings.node.NodeJS.EventEmitter
  }
  
  @JSGlobal("Symbol")
  @js.native
  val Symbol: SymbolConstructor = js.native
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
}
