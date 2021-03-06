/*
 * This file is part of adventure-text-minimessage, licensed under the MIT License.
 *
 * Copyright (c) 2018-2020 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.adventure.text.minimessage.parser;

import net.kyori.adventure.text.minimessage.ParseException;

import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * An exception that happens while parsing.
 *
 * @since 4.1.0
 */
public class ParsingException extends ParseException {
  private static final long serialVersionUID = 2507190809441787201l;

  private String message;
  private final int column;

  /**
   * Create a new parsing exception.
   *
   * @param message the detail message
   * @param column character index into the text where the parse error occurred.
   * @since 4.1.0
   */
  public ParsingException(final String message, final int column) {
    super(message);
    this.message = message;
    this.column = column;
  }

  @Override
  public String getMessage() {
    return this.message;
  }

  /**
   * Set this exception's message.
   *
   * @param message the new message
   * @since 4.1.0
   */
  public void message(final @Nullable String message) {
    this.message = message;
  }

  /**
   * Get the column this exception was triggered at.
   *
   * <p>If the column is unknown, {@code -1} will be returned.</p>
   *
   * @return the context column
   * @since 4.1.0
   */
  public int column() {
    return this.column;
  }
}
