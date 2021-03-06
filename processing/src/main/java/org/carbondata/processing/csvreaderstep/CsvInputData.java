/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.carbondata.processing.csvreaderstep;

import java.io.InputStream;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;
import org.pentaho.di.trans.steps.textfileinput.EncodingType;

public class CsvInputData extends BaseStepData implements StepDataInterface {
  public RowMetaInterface convertRowMeta;
  public RowMetaInterface outputRowMeta;

  public byte[] byteBuffer;

  public byte[] delimiter;
  public byte[] enclosure;

  public int preferredBufferSize;
  public String[] filenames;
  public int filenr;
  public byte[] binaryFilename;
  public boolean isAddingRowNumber;
  public long rowNumber;
  public int totalNumberOfSteps;
  public long bytesToSkipInFirstFile;
  public long totalBytesRead;
  public boolean parallel;
  public int filenameFieldIndex;
  public int rownumFieldIndex;
  /**
   * <pre>
   * if true then when double enclosure appears one will be considered as escape enclosure
   * Ecample: 'abc''xyz' would be processed as abc'xyz
   * </pre>
   */
  public EncodingType encodingType;
  public PatternMatcherInterface delimiterMatcher;
  public PatternMatcherInterface enclosureMatcher;
  public CrLfMatcherInterface crLfMatcher;
  protected InputStream bufferedInputStream;

  public CsvInputData() {
    super();
    byteBuffer = new byte[] {};
  }
}
