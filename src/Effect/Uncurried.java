    // EffectFnN shares the backend's curried representation, like
    // Data.Function.Uncurried: making one is the identity and running one
    // applies the chain, leaving the effect (Supplier) ready to run.
    @SuppressWarnings("unchecked")
    private static Object __effectFnApply(Object fn, Object... args) {
        Object result = fn;
        for (Object arg : args) result = ((java.util.function.Function<Object, Object>) result).apply(arg);
        return result;
    }

    public static Object mkEffectFn1 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn2 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn3 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn4 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn5 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn6 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn7 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn8 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn9 = (java.util.function.Function<Object, Object>) (fn) -> fn;
    public static Object mkEffectFn10 = (java.util.function.Function<Object, Object>) (fn) -> fn;

    public static Object runEffectFn1 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) -> __effectFnApply(fn, a);
    public static Object runEffectFn2 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) -> __effectFnApply(fn, a, b);
    public static Object runEffectFn3 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) -> __effectFnApply(fn, a, b, c);
    public static Object runEffectFn4 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) -> __effectFnApply(fn, a, b, c, d);
    public static Object runEffectFn5 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) -> __effectFnApply(fn, a, b, c, d, e);
    public static Object runEffectFn6 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) -> __effectFnApply(fn, a, b, c, d, e, g);
    public static Object runEffectFn7 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) -> __effectFnApply(fn, a, b, c, d, e, g, h);
    public static Object runEffectFn8 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) -> __effectFnApply(fn, a, b, c, d, e, g, h, i);
    public static Object runEffectFn9 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (j) -> __effectFnApply(fn, a, b, c, d, e, g, h, i, j);
    public static Object runEffectFn10 = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (b) ->
        (java.util.function.Function<Object, Object>) (c) ->
        (java.util.function.Function<Object, Object>) (d) ->
        (java.util.function.Function<Object, Object>) (e) ->
        (java.util.function.Function<Object, Object>) (g) ->
        (java.util.function.Function<Object, Object>) (h) ->
        (java.util.function.Function<Object, Object>) (i) ->
        (java.util.function.Function<Object, Object>) (j) ->
        (java.util.function.Function<Object, Object>) (k) -> __effectFnApply(fn, a, b, c, d, e, g, h, i, j, k);
