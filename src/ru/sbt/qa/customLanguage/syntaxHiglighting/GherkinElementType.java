package ru.sbt.qa.customLanguage.syntaxHiglighting;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.sbt.qa.customLanguage.registeringFileType.GherkinLanguage;

/**
 * @author yole
 */
public class GherkinElementType extends IElementType {
  public GherkinElementType(@NotNull @NonNls String debugName) {
    super(debugName, GherkinLanguage.INSTANCE);
  }
}
