// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyRulesTemplateTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesTemplateTemplateArgs Empty = new GetPropertyRulesTemplateTemplateArgs();

    @Import(name="templateData", required=true)
    private Output<String> templateData;

    public Output<String> templateData() {
        return this.templateData;
    }

    @Import(name="templateDir", required=true)
    private Output<String> templateDir;

    public Output<String> templateDir() {
        return this.templateDir;
    }

    private GetPropertyRulesTemplateTemplateArgs() {}

    private GetPropertyRulesTemplateTemplateArgs(GetPropertyRulesTemplateTemplateArgs $) {
        this.templateData = $.templateData;
        this.templateDir = $.templateDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesTemplateTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesTemplateTemplateArgs $;

        public Builder() {
            $ = new GetPropertyRulesTemplateTemplateArgs();
        }

        public Builder(GetPropertyRulesTemplateTemplateArgs defaults) {
            $ = new GetPropertyRulesTemplateTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder templateData(Output<String> templateData) {
            $.templateData = templateData;
            return this;
        }

        public Builder templateData(String templateData) {
            return templateData(Output.of(templateData));
        }

        public Builder templateDir(Output<String> templateDir) {
            $.templateDir = templateDir;
            return this;
        }

        public Builder templateDir(String templateDir) {
            return templateDir(Output.of(templateDir));
        }

        public GetPropertyRulesTemplateTemplateArgs build() {
            $.templateData = Objects.requireNonNull($.templateData, "expected parameter 'templateData' to be non-null");
            $.templateDir = Objects.requireNonNull($.templateDir, "expected parameter 'templateDir' to be non-null");
            return $;
        }
    }

}
