package ch.grosscy.exercises.utils;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.DefaultArgumentConverter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParameterConversionUtils {
    public static class StringToListArgumentConverter implements ArgumentConverter {
        @Override
        public Object convert(Object source, ParameterContext context)
                throws ArgumentConversionException {
            if (source != null && !(source instanceof String)) {
                throw new ArgumentConversionException("Source must be a string");
            }
            if (!List.class.isAssignableFrom(context.getParameter().getType())) {
                throw new ArgumentConversionException("Target must be a list");
            }
            String sourceString = (String) source;
            if (sourceString == null) {
                return Collections.emptyList();
            } else if (sourceString.isEmpty()) {
                return Collections.emptyList();
            }

            try {
                var simpleName = Class.forName(context.getParameter()
                                                      .getParameterizedType()
                                                      .getTypeName().split("[<>]", -1)[1]);

                return Arrays.stream(sourceString.split("\\|"))
                             .map(s -> DefaultArgumentConverter.INSTANCE
                                     .convert(s, simpleName, context))
                             .toList();
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        }
    }
}
