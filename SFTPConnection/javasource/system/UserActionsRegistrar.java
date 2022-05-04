package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(sftpconnection.actions.GenerateKeyPair.class);
    registrator.registerUserAction(sftpconnection.actions.GetFileDocumentFromSFTPLocation.class);
    registrator.registerUserAction(sftpconnection.actions.GetFileListFromSFTPLocation.class);
    registrator.registerUserAction(sftpconnection.actions.SendFileDocumentToSFTPLocation.class);
    registrator.registerUserAction(sftpconnection.actions.SetKnownHosts.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
