    public static Object pureE = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> a;

    public static Object bindE = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () ->
            ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(((java.util.function.Supplier<Object>) a).get())).get();

    public static Object untilE = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            while (!((Boolean) ((java.util.function.Supplier<Object>) f).get())) { }
            return null;
        };

    public static Object whileE = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Supplier<Object>) () -> {
            while ((Boolean) ((java.util.function.Supplier<Object>) f).get()) {
                ((java.util.function.Supplier<Object>) a).get();
            }
            return null;
        };

    public static Object forE = (java.util.function.Function<Object, Object>) (lo) ->
        (java.util.function.Function<Object, Object>) (hi) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            for (int i = (Integer) lo; i < (Integer) hi; i++) {
                ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(i)).get();
            }
            return null;
        };

    public static Object foreachE = (java.util.function.Function<Object, Object>) (as) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Supplier<Object>) () -> {
            for (Object item : (Object[]) as) {
                ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) f).apply(item)).get();
            }
            return null;
        };
