/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daimor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.daimor.OpenAction")
@ActionRegistration(
        displayName = "#CTL_OpenAction")
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_OpenAction=Open file")
public final class OpenAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        FileChooserBuilder fcb = new FileChooserBuilder(org.daimor.OpenAction.class);
        fcb.setApproveText("Open");
        fcb.setFileFilter(new mFileFilter());

        JFileChooser jfc = fcb.createFileChooser();

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile();
                FileObject foSelectedFile = FileUtil.toFileObject(file);

                DataObject obj = DataObject.find(foSelectedFile);
                EditorCookie ec = obj.getLookup().lookup(EditorCookie.class);

                if (ec != null) {
                    ec.open();
                }

            } catch (DataObjectNotFoundException donfe) {
            }
        }
    }

    private static class mFileFilter extends FileFilter {

        @Override
        public boolean accept(File pathname) {

            if (pathname.isDirectory()){
                return true;
            }

            String[] path  = pathname.getPath().split("\\.");
            if (path[path.length - 1].equalsIgnoreCase("m")){
                return true;
            }

            return false;
        }

        @Override
        public String getDescription() {
            return "M files";
        }
    }
}
