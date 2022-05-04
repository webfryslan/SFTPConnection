// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftpconnection.proxies;

public class PrivateKey extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SFTPConnection.PrivateKey";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PassPhrase("PassPhrase"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public PrivateKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SFTPConnection.PrivateKey"));
	}

	protected PrivateKey(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject privateKeyMendixObject)
	{
		super(context, privateKeyMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SFTPConnection.PrivateKey", privateKeyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SFTPConnection.PrivateKey");
	}

	/**
	 * @deprecated Use 'PrivateKey.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sftpconnection.proxies.PrivateKey initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sftpconnection.proxies.PrivateKey.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sftpconnection.proxies.PrivateKey initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sftpconnection.proxies.PrivateKey(context, mendixObject);
	}

	public static sftpconnection.proxies.PrivateKey load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sftpconnection.proxies.PrivateKey.initialize(context, mendixObject);
	}

	public static java.util.List<sftpconnection.proxies.PrivateKey> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sftpconnection.proxies.PrivateKey> result = new java.util.ArrayList<sftpconnection.proxies.PrivateKey>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SFTPConnection.PrivateKey" + xpathConstraint))
			result.add(sftpconnection.proxies.PrivateKey.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of PassPhrase
	 */
	public final java.lang.String getPassPhrase()
	{
		return getPassPhrase(getContext());
	}

	/**
	 * @param context
	 * @return value of PassPhrase
	 */
	public final java.lang.String getPassPhrase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PassPhrase.toString());
	}

	/**
	 * Set value of PassPhrase
	 * @param passphrase
	 */
	public final void setPassPhrase(java.lang.String passphrase)
	{
		setPassPhrase(getContext(), passphrase);
	}

	/**
	 * Set value of PassPhrase
	 * @param context
	 * @param passphrase
	 */
	public final void setPassPhrase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String passphrase)
	{
		getMendixObject().setValue(context, MemberNames.PassPhrase.toString(), passphrase);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sftpconnection.proxies.PrivateKey that = (sftpconnection.proxies.PrivateKey) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SFTPConnection.PrivateKey";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}