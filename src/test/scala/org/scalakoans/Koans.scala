package org.scalakoans

import org.scalatest.Sequential

class Koans extends Sequential {
  override val nestedSuites =
    List(
      new AboutAsserts,
      new AboutValAndVar,
      new AboutLiteralStrings,
      new AboutImportsAndPackages,
      new AboutLiteralBooleans,
      new AboutLiteralNumbers,
      new AboutTuples,
      new AboutForExpressions,
      new AboutOptions,
      new AboutEmptyValues,
      new AboutPatternMatching,
      new AboutHigherOrderFunctions,
      //new AboutPartiallyAppliedFunctions, // optional
      //new AboutPartialFunctions, // optional
      new AboutLists,
      new AboutSets,
      new AboutMutableSets,
      new AboutSequencesAndArrays,
      new AboutMaps,
      new AboutMutableMaps,
      new AboutConstructors,
      new AboutNamedAndDefaultArguments,
      new AboutUniformAccessPrinciple,
      new AboutParentClasses,
      new AboutCaseClasses,
      new AboutTraits,
      new AboutEnumerations,
      new AboutImplicits,
      //new AboutTypeSignatures,  // optional
      new AboutInfixPrefixAndPostfixOperators,
      //new AboutInfixTypes, // optional
      new AboutInteroperability,
      new AboutAccessModifiers,
      new AboutPreconditions,
      //new AboutManifests,  // optional
    ).toIndexedSeq
}
