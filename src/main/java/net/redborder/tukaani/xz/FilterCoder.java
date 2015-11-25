/*
 * FilterCoder
 *
 * Author: Lasse Collin <lasse.collin@tukaani.org>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */

package net.redborder.tukaani.xz;

interface FilterCoder {
    boolean changesSize();
    boolean nonLastOK();
    boolean lastOK();
}
