package com.github.edustocchero.utils

class Functor<A>(private val inner: A) {
  fun <U> fmap(f: (A) -> U) = f(inner)
}
