// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorWatermarking {
    private @Nullable String abVariantLocation;
    private @Nullable String decryptionPassword1;
    private @Nullable String decryptionPassword2;
    private @Nullable String decryptionPasswordId1;
    private @Nullable String decryptionPasswordId2;
    private @Nullable Boolean enable;
    private @Nullable Boolean locked;
    private @Nullable String miscellaneousSettingsTitle;
    private @Nullable Boolean patternDecryptionEnable;
    private @Nullable String patternEncryptionTitle;
    private @Nullable Boolean signatureVerificationEnable;
    private @Nullable String templateUuid;
    private @Nullable String tokenSigningTitle;
    private @Nullable Boolean useOriginalAsA;
    private @Nullable String uuid;
    private @Nullable String verificationKeyId1;
    private @Nullable String verificationKeyId2;
    private @Nullable String verificationPublicKey1;
    private @Nullable String verificationPublicKey2;

    private GetPropertyRulesBuilderRulesV20230105BehaviorWatermarking() {}
    public Optional<String> abVariantLocation() {
        return Optional.ofNullable(this.abVariantLocation);
    }
    public Optional<String> decryptionPassword1() {
        return Optional.ofNullable(this.decryptionPassword1);
    }
    public Optional<String> decryptionPassword2() {
        return Optional.ofNullable(this.decryptionPassword2);
    }
    public Optional<String> decryptionPasswordId1() {
        return Optional.ofNullable(this.decryptionPasswordId1);
    }
    public Optional<String> decryptionPasswordId2() {
        return Optional.ofNullable(this.decryptionPasswordId2);
    }
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> miscellaneousSettingsTitle() {
        return Optional.ofNullable(this.miscellaneousSettingsTitle);
    }
    public Optional<Boolean> patternDecryptionEnable() {
        return Optional.ofNullable(this.patternDecryptionEnable);
    }
    public Optional<String> patternEncryptionTitle() {
        return Optional.ofNullable(this.patternEncryptionTitle);
    }
    public Optional<Boolean> signatureVerificationEnable() {
        return Optional.ofNullable(this.signatureVerificationEnable);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> tokenSigningTitle() {
        return Optional.ofNullable(this.tokenSigningTitle);
    }
    public Optional<Boolean> useOriginalAsA() {
        return Optional.ofNullable(this.useOriginalAsA);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> verificationKeyId1() {
        return Optional.ofNullable(this.verificationKeyId1);
    }
    public Optional<String> verificationKeyId2() {
        return Optional.ofNullable(this.verificationKeyId2);
    }
    public Optional<String> verificationPublicKey1() {
        return Optional.ofNullable(this.verificationPublicKey1);
    }
    public Optional<String> verificationPublicKey2() {
        return Optional.ofNullable(this.verificationPublicKey2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorWatermarking defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String abVariantLocation;
        private @Nullable String decryptionPassword1;
        private @Nullable String decryptionPassword2;
        private @Nullable String decryptionPasswordId1;
        private @Nullable String decryptionPasswordId2;
        private @Nullable Boolean enable;
        private @Nullable Boolean locked;
        private @Nullable String miscellaneousSettingsTitle;
        private @Nullable Boolean patternDecryptionEnable;
        private @Nullable String patternEncryptionTitle;
        private @Nullable Boolean signatureVerificationEnable;
        private @Nullable String templateUuid;
        private @Nullable String tokenSigningTitle;
        private @Nullable Boolean useOriginalAsA;
        private @Nullable String uuid;
        private @Nullable String verificationKeyId1;
        private @Nullable String verificationKeyId2;
        private @Nullable String verificationPublicKey1;
        private @Nullable String verificationPublicKey2;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorWatermarking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abVariantLocation = defaults.abVariantLocation;
    	      this.decryptionPassword1 = defaults.decryptionPassword1;
    	      this.decryptionPassword2 = defaults.decryptionPassword2;
    	      this.decryptionPasswordId1 = defaults.decryptionPasswordId1;
    	      this.decryptionPasswordId2 = defaults.decryptionPasswordId2;
    	      this.enable = defaults.enable;
    	      this.locked = defaults.locked;
    	      this.miscellaneousSettingsTitle = defaults.miscellaneousSettingsTitle;
    	      this.patternDecryptionEnable = defaults.patternDecryptionEnable;
    	      this.patternEncryptionTitle = defaults.patternEncryptionTitle;
    	      this.signatureVerificationEnable = defaults.signatureVerificationEnable;
    	      this.templateUuid = defaults.templateUuid;
    	      this.tokenSigningTitle = defaults.tokenSigningTitle;
    	      this.useOriginalAsA = defaults.useOriginalAsA;
    	      this.uuid = defaults.uuid;
    	      this.verificationKeyId1 = defaults.verificationKeyId1;
    	      this.verificationKeyId2 = defaults.verificationKeyId2;
    	      this.verificationPublicKey1 = defaults.verificationPublicKey1;
    	      this.verificationPublicKey2 = defaults.verificationPublicKey2;
        }

        @CustomType.Setter
        public Builder abVariantLocation(@Nullable String abVariantLocation) {
            this.abVariantLocation = abVariantLocation;
            return this;
        }
        @CustomType.Setter
        public Builder decryptionPassword1(@Nullable String decryptionPassword1) {
            this.decryptionPassword1 = decryptionPassword1;
            return this;
        }
        @CustomType.Setter
        public Builder decryptionPassword2(@Nullable String decryptionPassword2) {
            this.decryptionPassword2 = decryptionPassword2;
            return this;
        }
        @CustomType.Setter
        public Builder decryptionPasswordId1(@Nullable String decryptionPasswordId1) {
            this.decryptionPasswordId1 = decryptionPasswordId1;
            return this;
        }
        @CustomType.Setter
        public Builder decryptionPasswordId2(@Nullable String decryptionPasswordId2) {
            this.decryptionPasswordId2 = decryptionPasswordId2;
            return this;
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder miscellaneousSettingsTitle(@Nullable String miscellaneousSettingsTitle) {
            this.miscellaneousSettingsTitle = miscellaneousSettingsTitle;
            return this;
        }
        @CustomType.Setter
        public Builder patternDecryptionEnable(@Nullable Boolean patternDecryptionEnable) {
            this.patternDecryptionEnable = patternDecryptionEnable;
            return this;
        }
        @CustomType.Setter
        public Builder patternEncryptionTitle(@Nullable String patternEncryptionTitle) {
            this.patternEncryptionTitle = patternEncryptionTitle;
            return this;
        }
        @CustomType.Setter
        public Builder signatureVerificationEnable(@Nullable Boolean signatureVerificationEnable) {
            this.signatureVerificationEnable = signatureVerificationEnable;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder tokenSigningTitle(@Nullable String tokenSigningTitle) {
            this.tokenSigningTitle = tokenSigningTitle;
            return this;
        }
        @CustomType.Setter
        public Builder useOriginalAsA(@Nullable Boolean useOriginalAsA) {
            this.useOriginalAsA = useOriginalAsA;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder verificationKeyId1(@Nullable String verificationKeyId1) {
            this.verificationKeyId1 = verificationKeyId1;
            return this;
        }
        @CustomType.Setter
        public Builder verificationKeyId2(@Nullable String verificationKeyId2) {
            this.verificationKeyId2 = verificationKeyId2;
            return this;
        }
        @CustomType.Setter
        public Builder verificationPublicKey1(@Nullable String verificationPublicKey1) {
            this.verificationPublicKey1 = verificationPublicKey1;
            return this;
        }
        @CustomType.Setter
        public Builder verificationPublicKey2(@Nullable String verificationPublicKey2) {
            this.verificationPublicKey2 = verificationPublicKey2;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorWatermarking build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorWatermarking();
            _resultValue.abVariantLocation = abVariantLocation;
            _resultValue.decryptionPassword1 = decryptionPassword1;
            _resultValue.decryptionPassword2 = decryptionPassword2;
            _resultValue.decryptionPasswordId1 = decryptionPasswordId1;
            _resultValue.decryptionPasswordId2 = decryptionPasswordId2;
            _resultValue.enable = enable;
            _resultValue.locked = locked;
            _resultValue.miscellaneousSettingsTitle = miscellaneousSettingsTitle;
            _resultValue.patternDecryptionEnable = patternDecryptionEnable;
            _resultValue.patternEncryptionTitle = patternEncryptionTitle;
            _resultValue.signatureVerificationEnable = signatureVerificationEnable;
            _resultValue.templateUuid = templateUuid;
            _resultValue.tokenSigningTitle = tokenSigningTitle;
            _resultValue.useOriginalAsA = useOriginalAsA;
            _resultValue.uuid = uuid;
            _resultValue.verificationKeyId1 = verificationKeyId1;
            _resultValue.verificationKeyId2 = verificationKeyId2;
            _resultValue.verificationPublicKey1 = verificationPublicKey1;
            _resultValue.verificationPublicKey2 = verificationPublicKey2;
            return _resultValue;
        }
    }
}
