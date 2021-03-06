// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sftpconnection.actions;

import sftpconnection.helpers.HandleFileSftp;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Generates a key pair and saves the files in the objects.
 */
public class GenerateKeyPair extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __passPhraseEntry;
	private sftpconnection.proxies.PassPhraseEntry passPhraseEntry;
	private IMendixObject __publicKey;
	private sftpconnection.proxies.PublicKey publicKey;
	private IMendixObject __privateKey;
	private sftpconnection.proxies.PrivateKey privateKey;

	public GenerateKeyPair(IContext context, IMendixObject passPhraseEntry, IMendixObject publicKey, IMendixObject privateKey)
	{
		super(context);
		this.__passPhraseEntry = passPhraseEntry;
		this.__publicKey = publicKey;
		this.__privateKey = privateKey;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.passPhraseEntry = __passPhraseEntry == null ? null : sftpconnection.proxies.PassPhraseEntry.initialize(getContext(), __passPhraseEntry);

		this.publicKey = __publicKey == null ? null : sftpconnection.proxies.PublicKey.initialize(getContext(), __publicKey);

		this.privateKey = __privateKey == null ? null : sftpconnection.proxies.PrivateKey.initialize(getContext(), __privateKey);

		// BEGIN USER CODE

		return HandleFileSftp.generateKeyPair(privateKey, publicKey, passPhraseEntry, this.getContext());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateKeyPair";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
