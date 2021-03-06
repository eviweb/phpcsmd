package de.foopara.phpcsmd;

import javax.swing.JComponent;

import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;
import org.openide.util.Lookup;

import de.foopara.phpcsmd.ui.PropertyPanel;
import de.foopara.phpcsmd.ui.PropertyPanelOkAction;

public class ProjectProperties implements ProjectCustomizer.CompositeCategoryProvider
{

    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-netbeans-modules-php-project", position = 900)
//    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-netbeans-api-project", position = 900)
    public static ProjectProperties createProperties() {
        return new ProjectProperties();
    }

    @Override
    public Category createCategory(Lookup context) {
        //ResourceBundle bundle = NbBundle.getBundle(PHPCSMD.class);
        return ProjectCustomizer.Category.create("phpcsmd", "Phpcsmd", null);
    }

    @Override
    public JComponent createComponent(Category category, Lookup context) {
        PropertyPanel panel = new PropertyPanel(context);
        PropertyPanelOkAction act = new PropertyPanelOkAction();
        act.setPanel(panel);
        category.setOkButtonListener(act);
        return panel;
    }

}
