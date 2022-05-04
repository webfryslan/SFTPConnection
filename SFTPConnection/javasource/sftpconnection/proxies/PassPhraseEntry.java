// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftpconnection.proxies;

public class PassPhraseEntry
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject passPhraseEntryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SFTPConnection.PassPhraseEntry";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PassPhraseInput("PassPhraseInput"),
		ConfirmNewKeyPair("ConfirmNewKeyPair"),
		PassPhraseEntry_SFTPConfiguration("SFTPConnection.PassPhraseEntry_SFTPConfiguration");

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

	public PassPhraseEntry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SFTPConnection.PassPhraseEntry"));
	}

	protected PassPhraseEntry(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject passPhraseEntryMendixObject)
	{
		if (passPhraseEntryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SFTPConnection.PassPhraseEntry", passPhraseEntryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SFTPConnection.PassPhraseEntry");

		this.passPhraseEntryMendixObject = passPhraseEntryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PassPhraseEntry.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sftpconnection.proxies.PassPhraseEntry initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sftpconnection.proxies.PassPhraseEntry.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sftpconnection.proxies.PassPhraseEntry initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sftpconnection.proxies.PassPhraseEntry(context, mendixObject);
	}

	public static sftpconnection.proxies.PassPhraseEntry load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sftpconnection.proxies.PassPhraseEntry.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PassPhraseInput
	 */
	public final java.lang.String getPassPhraseInput()
	{
		return getPassPhraseInput(getContext());
	}

	/**
	 * @param context
	 * @return value of PassPhraseInput
	 */
	public final java.lang.String getPassPhraseInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PassPhraseInput.toString());
	}

	/**
	 * Set value of PassPhraseInput
	 * @param passphraseinput
	 */
	public final void setPassPhraseInput(java.lang.String passphraseinput)
	{
		setPassPhraseInput(getContext(), passphraseinput);
	}

	/**
	 * Set value of PassPhraseInput
	 * @param context
	 * @param passphraseinput
	 */
	public final void setPassPhraseInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String passphraseinput)
	{
		getMendixObject().setValue(context, MemberNames.PassPhraseInput.toString(), passphraseinput);
	}

	/**
	 * @return value of ConfirmNewKeyPair
	 */
	public final java.lang.Boolean getConfirmNewKeyPair()
	{
		return getConfirmNewKeyPair(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfirmNewKeyPair
	 */
	public final java.lang.Boolean getConfirmNewKeyPair(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ConfirmNewKeyPair.toString());
	}

	/**
	 * Set value of ConfirmNewKeyPair
	 * @param confirmnewkeypair
	 */
	public final void setConfirmNewKeyPair(java.lang.Boolean confirmnewkeypair)
	{
		setConfirmNewKeyPair(getContext(), confirmnewkeypair);
	}

	/**
	 * Set value of ConfirmNewKeyPair
	 * @param context
	 * @param confirmnewkeypair
	 */
	public final void setConfirmNewKeyPair(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean confirmnewkeypair)
	{
		getMendixObject().setValue(context, MemberNames.ConfirmNewKeyPair.toString(), confirmnewkeypair);
	}

	/**
	 * @return value of PassPhraseEntry_SFTPConfiguration
	 */
	public final sftpconnection.proxies.SFTPConfiguration getPassPhraseEntry_SFTPConfiguration() throws com.mendix.core.CoreException
	{
		return getPassPhraseEntry_SFTPConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of PassPhraseEntry_SFTPConfiguration
	 */
	public final sftpconnection.proxies.SFTPConfiguration getPassPhraseEntry_SFTPConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sftpconnection.proxies.SFTPConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PassPhraseEntry_SFTPConfiguration.toString());
		if (identifier != null)
			result = sftpconnection.proxies.SFTPConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PassPhraseEntry_SFTPConfiguration
	 * @param passphraseentry_sftpconfiguration
	 */
	public final void setPassPhraseEntry_SFTPConfiguration(sftpconnection.proxies.SFTPConfiguration passphraseentry_sftpconfiguration)
	{
		setPassPhraseEntry_SFTPConfiguration(getContext(), passphraseentry_sftpconfiguration);
	}

	/**
	 * Set value of PassPhraseEntry_SFTPConfiguration
	 * @param context
	 * @param passphraseentry_sftpconfiguration
	 */
	public final void setPassPhraseEntry_SFTPConfiguration(com.mendix.systemwideinterfaces.core.IContext context, sftpconnection.proxies.SFTPConfiguration passphraseentry_sftpconfiguration)
	{
		if (passphraseentry_sftpconfiguration == null)
			getMendixObject().setValue(context, MemberNames.PassPhraseEntry_SFTPConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PassPhraseEntry_SFTPConfiguration.toString(), passphraseentry_sftpconfiguration.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return passPhraseEntryMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sftpconnection.proxies.PassPhraseEntry that = (sftpconnection.proxies.PassPhraseEntry) obj;
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
		return "SFTPConnection.PassPhraseEntry";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
