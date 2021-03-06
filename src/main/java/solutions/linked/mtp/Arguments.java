/*
 * The MIT License
 *
 * Copyright 2019 FactsMission AG.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package solutions.linked.mtp;

import org.wymiwyg.commons.util.arguments.CommandLine;

/**
 *
 * @author user
 */
public interface Arguments {
    
    @CommandLine (
        longName ="verbose",
        shortName = "V",
        required = false,
        defaultValue = "false",
        description = "Log successful documents"
    )
    public boolean verbose();
    
    @CommandLine (
        longName ="index",
        shortName = "I",
        required = false,
        defaultValue = "http://prefix.cc/popular/all.file.vann",
        description = "Defines the index graph describing the prefixes using the vann vocabulary."
    )
    public String index();
    
    @CommandLine (
        longName ="base",
        shortName = "B",
        required = false,
        defaultValue = "https://mtp.linked.solutions/",
        description = "The base URI used wehn parsing the index."
    )
    public String base();
    
    @CommandLine (
        longName ="output",
        shortName = "O",
        required = false,
        defaultValue = "storage",
        description = "Path to the directory where the harvest shall be stored."
    )
    public String output();

}
