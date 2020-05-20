package de.koandesign.qit


fun precondition(isRequirementFulfilled: Boolean): Unit? = if (isRequirementFulfilled) Unit else null
