// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate();

    @Import(name="pemEncodedCert")
    private @Nullable String pemEncodedCert;

    public Optional<String> pemEncodedCert() {
        return Optional.ofNullable(this.pemEncodedCert);
    }

    @Import(name="sha1Fingerprint")
    private @Nullable String sha1Fingerprint;

    public Optional<String> sha1Fingerprint() {
        return Optional.ofNullable(this.sha1Fingerprint);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate $) {
        this.pemEncodedCert = $.pemEncodedCert;
        this.sha1Fingerprint = $.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate(Objects.requireNonNull(defaults));
        }

        public Builder pemEncodedCert(@Nullable String pemEncodedCert) {
            $.pemEncodedCert = pemEncodedCert;
            return this;
        }

        public Builder sha1Fingerprint(@Nullable String sha1Fingerprint) {
            $.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificate build() {
            return $;
        }
    }

}