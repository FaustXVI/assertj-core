/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.internal;

import static org.junit.Assert.*;

import org.assertj.core.internal.ComparatorBasedComparisonStrategy;
import org.junit.Test;

/**
 * Tests for {@link ComparatorBasedComparisonStrategy#stringContains(String, String)}.
 * 
 * @author Joel Costigliola
 */
public class ComparatorBasedComparisonStrategy_stringEndsWith_Test extends AbstractTest_ComparatorBasedComparisonStrategy {

  @Test
  public void should_pass() {
    assertTrue(caseInsensitiveComparisonStrategy.stringEndsWith("Frodo", "do"));
    assertTrue(caseInsensitiveComparisonStrategy.stringEndsWith("Frodo", "DO"));
    assertFalse(caseInsensitiveComparisonStrategy.stringEndsWith("Frodo", "d"));
    assertFalse(caseInsensitiveComparisonStrategy.stringEndsWith("Frodo", "Mr Frodo"));
  }

}
