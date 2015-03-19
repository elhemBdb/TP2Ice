// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `Message.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package TP2;

public class Message implements java.lang.Cloneable, java.io.Serializable
{
    public String title;

    public String author;

    public String date;

    public String body;

    public Message()
    {
    }

    public Message(String title, String author, String date, String body)
    {
        this.title = title;
        this.author = author;
        this.date = date;
        this.body = body;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        Message _r = null;
        try
        {
            _r = (Message)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(title != _r.title)
            {
                if(title == null || _r.title == null || !title.equals(_r.title))
                {
                    return false;
                }
            }
            if(author != _r.author)
            {
                if(author == null || _r.author == null || !author.equals(_r.author))
                {
                    return false;
                }
            }
            if(date != _r.date)
            {
                if(date == null || _r.date == null || !date.equals(_r.date))
                {
                    return false;
                }
            }
            if(body != _r.body)
            {
                if(body == null || _r.body == null || !body.equals(_r.body))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        if(title != null)
        {
            __h = 5 * __h + title.hashCode();
        }
        if(author != null)
        {
            __h = 5 * __h + author.hashCode();
        }
        if(date != null)
        {
            __h = 5 * __h + date.hashCode();
        }
        if(body != null)
        {
            __h = 5 * __h + body.hashCode();
        }
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(title);
        __os.writeString(author);
        __os.writeString(date);
        __os.writeString(body);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        title = __is.readString();
        author = __is.readString();
        date = __is.readString();
        body = __is.readString();
    }
}