/**
 * Copyright (C) 2015 Trustees of Indiana University
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.samza.sql.api.expressions;

import org.apache.samza.sql.api.data.Tuple;

public interface ScalarExpression {

  /**
   * Evaluate underlying expression on an array of input values and returns a single value.
   *
   * @param inputValues array of input values to the expression
   * @return result of the underlying expression evaluation
   */
  Object execute(Object[] inputValues);

  /**
   * Evaluate underlying expression on a tuple and returns a single value.
   *
   * @param tuple input tuple to the expression
   * @return result of the underlying expression evaluation
   */
  Object execute(Tuple tuple);
}
