package typings.rxjs

import _root_.typings.rxjs.internalTypesMod.OperatorFunction
import _root_.typings.rxjs.internalTypesMod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalObservableMod {
  
  @JSImport("rxjs/internal/Observable", "Observable")
  @js.native
  open class Observable[T] ()
    extends StObject
       with Subscribable[T] {
    
    /** Internal implementation detail, do not use directly. */
    var _isScalar: Boolean = js.native
    
    def foo(source: Observable[Double]): Observable[String] = js.native
    @JSName("foo")
    var foo_Original: OperatorFunction[Double, String] = js.native
    
    def pipe(): Observable[T] = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    var source: Observable[Any] = js.native
  }
}
