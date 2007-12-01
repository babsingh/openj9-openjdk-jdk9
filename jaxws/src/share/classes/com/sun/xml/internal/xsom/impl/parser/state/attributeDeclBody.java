/*
 * Copyright 2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/* this file is generated by RelaxNGCC */
package com.sun.xml.internal.xsom.impl.parser.state;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import com.sun.xml.internal.xsom.impl.parser.NGCCRuntimeEx;

    import com.sun.xml.internal.xsom.*;
    import com.sun.xml.internal.xsom.parser.*;
    import com.sun.xml.internal.xsom.impl.*;
    import com.sun.xml.internal.xsom.impl.parser.*;
    import org.xml.sax.Locator;
    import org.xml.sax.ContentHandler;
    import org.xml.sax.helpers.*;
    import java.util.*;



class attributeDeclBody extends NGCCHandler {
    private String name;
    private ForeignAttributesImpl fa;
    private AnnotationImpl annotation;
    private Locator locator;
    private boolean isLocal;
    private String defaultValue;
    private UName typeName;
    private String fixedValue;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public attributeDeclBody(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie, Locator _locator, boolean _isLocal, String _defaultValue, String _fixedValue) {
        super(source, parent, cookie);
        $runtime = runtime;
        this.locator = _locator;
        this.isLocal = _isLocal;
        this.defaultValue = _defaultValue;
        this.fixedValue = _fixedValue;
        $_ngcc_current_state = 13;
    }

    public attributeDeclBody(NGCCRuntimeEx runtime, Locator _locator, boolean _isLocal, String _defaultValue, String _fixedValue) {
        this(null, runtime, runtime, -1, _locator, _isLocal, _defaultValue, _fixedValue);
    }

    private void action0()throws SAXException {

          type = new DelayedRef.SimpleType(
            $runtime, locator, $runtime.currentSchema, typeName );

}

    private void action1()throws SAXException {
        formSpecified = true;
}

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 7:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 686, null,AnnotationContext.ATTRIBUTE_DECL);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 1;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 1:
            {
                if(($ai = $runtime.getAttributeIndex("","type"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType"))) {
                        NGCCHandler h = new simpleType(this, super._source, $runtime, 677);
                        spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                    }
                    else {
                        $_ngcc_current_state = 0;
                        $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                    }
                }
            }
            break;
        case 9:
            {
                if((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation")) || ((($ai = $runtime.getAttributeIndex("","type"))>=0 && (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation")))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType"))))) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 12:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 13:
            {
                if(($ai = $runtime.getAttributeIndex("","form"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 12;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterElement(makeResult(), super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 7:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                if(($ai = $runtime.getAttributeIndex("","type"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 9:
            {
                if(($ai = $runtime.getAttributeIndex("","type"))>=0) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
            }
            break;
        case 12:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 13:
            {
                if(($ai = $runtime.getAttributeIndex("","form"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 12;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromLeaveElement(makeResult(), super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 7:
            {
                $_ngcc_current_state = 1;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                if(($__uri.equals("") && $__local.equals("type"))) {
                    $_ngcc_current_state = 5;
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 9:
            {
                if(($__uri.equals("") && $__local.equals("type"))) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
                }
            }
            break;
        case 12:
            {
                if(($__uri.equals("") && $__local.equals("name"))) {
                    $_ngcc_current_state = 11;
                }
                else {
                    unexpectedEnterAttribute($__qname);
                }
            }
            break;
        case 13:
            {
                if(($__uri.equals("") && $__local.equals("form"))) {
                    $_ngcc_current_state = 15;
                }
                else {
                    $_ngcc_current_state = 12;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterAttribute(makeResult(), super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 14:
            {
                if(($__uri.equals("") && $__local.equals("form"))) {
                    $_ngcc_current_state = 12;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 7:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 4:
            {
                if(($__uri.equals("") && $__local.equals("type"))) {
                    $_ngcc_current_state = 0;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 1:
            {
                $_ngcc_current_state = 0;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 10:
            {
                if(($__uri.equals("") && $__local.equals("name"))) {
                    $_ngcc_current_state = 9;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 9:
            {
                NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                spawnChildFromLeaveAttribute(h, $__uri, $__local, $__qname);
            }
            break;
        case 13:
            {
                $_ngcc_current_state = 12;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromLeaveAttribute(makeResult(), super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 7:
            {
                $_ngcc_current_state = 1;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 1:
            {
                if(($ai = $runtime.getAttributeIndex("","type"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 0;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 9:
            {
                if(($ai = $runtime.getAttributeIndex("","type"))>=0) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromText(h, $value);
                }
                else {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 688, fa);
                    spawnChildFromText(h, $value);
                }
            }
            break;
        case 11:
            {
                name = $value;
                $_ngcc_current_state = 10;
            }
            break;
        case 12:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 5:
            {
                NGCCHandler h = new qname(this, super._source, $runtime, 679);
                spawnChildFromText(h, $value);
            }
            break;
        case 15:
            {
                if($value.equals("unqualified")) {
                    NGCCHandler h = new qualification(this, super._source, $runtime, 693);
                    spawnChildFromText(h, $value);
                }
                else {
                    if($value.equals("qualified")) {
                        NGCCHandler h = new qualification(this, super._source, $runtime, 693);
                        spawnChildFromText(h, $value);
                    }
                }
            }
            break;
        case 13:
            {
                if(($ai = $runtime.getAttributeIndex("","form"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 12;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 0:
            {
                revertToParentFromText(makeResult(), super._cookie, $value);
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 677:
            {
                type = ((SimpleTypeImpl)$__result__);
                $_ngcc_current_state = 0;
            }
            break;
        case 688:
            {
                fa = ((ForeignAttributesImpl)$__result__);
                $_ngcc_current_state = 7;
            }
            break;
        case 693:
            {
                form = ((Boolean)$__result__).booleanValue();
                action1();
                $_ngcc_current_state = 14;
            }
            break;
        case 679:
            {
                typeName = ((UName)$__result__);
                action0();
                $_ngcc_current_state = 4;
            }
            break;
        case 686:
            {
                annotation = ((AnnotationImpl)$__result__);
                $_ngcc_current_state = 1;
            }
            break;
        }
    }

    public boolean accepted() {
        return((($_ngcc_current_state == 7) || (($_ngcc_current_state == 0) || ($_ngcc_current_state == 1))));
    }


      private boolean form;
      private boolean formSpecified = false;

      private AttributeDeclImpl makeResult() {

        if(type==null)
          // type defaults to anySimpleType
          type = $runtime.parser.schemaSet.anySimpleType;

        if(!formSpecified) form = $runtime.attributeFormDefault;
          // global attributes are always qualified
          if(!isLocal)       form = true;

        String tns;
        if(form==true)  tns = $runtime.currentSchema.getTargetNamespace();
        else            tns = "";

        // proper handling of anonymous types
        return new AttributeDeclImpl( $runtime.document, tns, name,
          annotation, locator, fa, isLocal,
          $runtime.createXmlString(defaultValue),
          $runtime.createXmlString(fixedValue),
          type );
      }
      private Ref.SimpleType type;

}
