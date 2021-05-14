package com.auditcom.persistqueue;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.auditcom.persistqueue");

        noClasses()
            .that()
            .resideInAnyPackage("com.auditcom.persistqueue.service..")
            .or()
            .resideInAnyPackage("com.auditcom.persistqueue.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.auditcom.persistqueue.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
