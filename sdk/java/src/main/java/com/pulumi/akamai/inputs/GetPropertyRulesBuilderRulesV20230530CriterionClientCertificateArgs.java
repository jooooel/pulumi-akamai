// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs Empty = new GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs();

    @Import(name="isCertificatePresent")
    private @Nullable Output<Boolean> isCertificatePresent;

    public Optional<Output<Boolean>> isCertificatePresent() {
        return Optional.ofNullable(this.isCertificatePresent);
    }

    @Import(name="isCertificateValid")
    private @Nullable Output<String> isCertificateValid;

    public Optional<Output<String>> isCertificateValid() {
        return Optional.ofNullable(this.isCertificateValid);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs(GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs $) {
        this.isCertificatePresent = $.isCertificatePresent;
        this.isCertificateValid = $.isCertificateValid;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder isCertificatePresent(@Nullable Output<Boolean> isCertificatePresent) {
            $.isCertificatePresent = isCertificatePresent;
            return this;
        }

        public Builder isCertificatePresent(Boolean isCertificatePresent) {
            return isCertificatePresent(Output.of(isCertificatePresent));
        }

        public Builder isCertificateValid(@Nullable Output<String> isCertificateValid) {
            $.isCertificateValid = isCertificateValid;
            return this;
        }

        public Builder isCertificateValid(String isCertificateValid) {
            return isCertificateValid(Output.of(isCertificateValid));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionClientCertificateArgs build() {
            return $;
        }
    }

}
