// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate Empty = new GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate();

    @Import(name="isCertificatePresent")
    private @Nullable Boolean isCertificatePresent;

    public Optional<Boolean> isCertificatePresent() {
        return Optional.ofNullable(this.isCertificatePresent);
    }

    @Import(name="isCertificateValid")
    private @Nullable String isCertificateValid;

    public Optional<String> isCertificateValid() {
        return Optional.ofNullable(this.isCertificateValid);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate(GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate $) {
        this.isCertificatePresent = $.isCertificatePresent;
        this.isCertificateValid = $.isCertificateValid;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate(Objects.requireNonNull(defaults));
        }

        public Builder isCertificatePresent(@Nullable Boolean isCertificatePresent) {
            $.isCertificatePresent = isCertificatePresent;
            return this;
        }

        public Builder isCertificateValid(@Nullable String isCertificateValid) {
            $.isCertificateValid = isCertificateValid;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionClientCertificate build() {
            return $;
        }
    }

}
