// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorOriginCharacteristics {
    private @Nullable Boolean accessKeyEncryptedStorage;
    private @Nullable String adcTitle;
    private @Nullable String authenticationMethod;
    private @Nullable String authenticationMethodTitle;
    private @Nullable String awsAccessKeyId;
    private @Nullable String awsAccessKeyVersionGuid;
    private @Nullable String awsHost;
    private @Nullable String awsRegion;
    private @Nullable String awsSecretAccessKey;
    private @Nullable String awsService;
    private @Nullable String country;
    private @Nullable List<String> customSignStrings;
    private @Nullable String directConnectGeo;
    private @Nullable Integer encodingVersion;
    private @Nullable String gcsAccessKeyVersionGuid;
    private @Nullable String gcsHmacKeyAccessId;
    private @Nullable String gcsHmacKeySecret;
    private @Nullable Boolean locked;
    private @Nullable String mslkey;
    private @Nullable String mslname;
    private @Nullable String nonce;
    private @Nullable String secretKey;
    private @Nullable String templateUuid;
    private @Nullable Boolean useCustomSignString;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCharacteristics() {}
    public Optional<Boolean> accessKeyEncryptedStorage() {
        return Optional.ofNullable(this.accessKeyEncryptedStorage);
    }
    public Optional<String> adcTitle() {
        return Optional.ofNullable(this.adcTitle);
    }
    public Optional<String> authenticationMethod() {
        return Optional.ofNullable(this.authenticationMethod);
    }
    public Optional<String> authenticationMethodTitle() {
        return Optional.ofNullable(this.authenticationMethodTitle);
    }
    public Optional<String> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }
    public Optional<String> awsAccessKeyVersionGuid() {
        return Optional.ofNullable(this.awsAccessKeyVersionGuid);
    }
    public Optional<String> awsHost() {
        return Optional.ofNullable(this.awsHost);
    }
    public Optional<String> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }
    public Optional<String> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }
    public Optional<String> awsService() {
        return Optional.ofNullable(this.awsService);
    }
    public Optional<String> country() {
        return Optional.ofNullable(this.country);
    }
    public List<String> customSignStrings() {
        return this.customSignStrings == null ? List.of() : this.customSignStrings;
    }
    public Optional<String> directConnectGeo() {
        return Optional.ofNullable(this.directConnectGeo);
    }
    public Optional<Integer> encodingVersion() {
        return Optional.ofNullable(this.encodingVersion);
    }
    public Optional<String> gcsAccessKeyVersionGuid() {
        return Optional.ofNullable(this.gcsAccessKeyVersionGuid);
    }
    public Optional<String> gcsHmacKeyAccessId() {
        return Optional.ofNullable(this.gcsHmacKeyAccessId);
    }
    public Optional<String> gcsHmacKeySecret() {
        return Optional.ofNullable(this.gcsHmacKeySecret);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> mslkey() {
        return Optional.ofNullable(this.mslkey);
    }
    public Optional<String> mslname() {
        return Optional.ofNullable(this.mslname);
    }
    public Optional<String> nonce() {
        return Optional.ofNullable(this.nonce);
    }
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Boolean> useCustomSignString() {
        return Optional.ofNullable(this.useCustomSignString);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCharacteristics defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean accessKeyEncryptedStorage;
        private @Nullable String adcTitle;
        private @Nullable String authenticationMethod;
        private @Nullable String authenticationMethodTitle;
        private @Nullable String awsAccessKeyId;
        private @Nullable String awsAccessKeyVersionGuid;
        private @Nullable String awsHost;
        private @Nullable String awsRegion;
        private @Nullable String awsSecretAccessKey;
        private @Nullable String awsService;
        private @Nullable String country;
        private @Nullable List<String> customSignStrings;
        private @Nullable String directConnectGeo;
        private @Nullable Integer encodingVersion;
        private @Nullable String gcsAccessKeyVersionGuid;
        private @Nullable String gcsHmacKeyAccessId;
        private @Nullable String gcsHmacKeySecret;
        private @Nullable Boolean locked;
        private @Nullable String mslkey;
        private @Nullable String mslname;
        private @Nullable String nonce;
        private @Nullable String secretKey;
        private @Nullable String templateUuid;
        private @Nullable Boolean useCustomSignString;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCharacteristics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyEncryptedStorage = defaults.accessKeyEncryptedStorage;
    	      this.adcTitle = defaults.adcTitle;
    	      this.authenticationMethod = defaults.authenticationMethod;
    	      this.authenticationMethodTitle = defaults.authenticationMethodTitle;
    	      this.awsAccessKeyId = defaults.awsAccessKeyId;
    	      this.awsAccessKeyVersionGuid = defaults.awsAccessKeyVersionGuid;
    	      this.awsHost = defaults.awsHost;
    	      this.awsRegion = defaults.awsRegion;
    	      this.awsSecretAccessKey = defaults.awsSecretAccessKey;
    	      this.awsService = defaults.awsService;
    	      this.country = defaults.country;
    	      this.customSignStrings = defaults.customSignStrings;
    	      this.directConnectGeo = defaults.directConnectGeo;
    	      this.encodingVersion = defaults.encodingVersion;
    	      this.gcsAccessKeyVersionGuid = defaults.gcsAccessKeyVersionGuid;
    	      this.gcsHmacKeyAccessId = defaults.gcsHmacKeyAccessId;
    	      this.gcsHmacKeySecret = defaults.gcsHmacKeySecret;
    	      this.locked = defaults.locked;
    	      this.mslkey = defaults.mslkey;
    	      this.mslname = defaults.mslname;
    	      this.nonce = defaults.nonce;
    	      this.secretKey = defaults.secretKey;
    	      this.templateUuid = defaults.templateUuid;
    	      this.useCustomSignString = defaults.useCustomSignString;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accessKeyEncryptedStorage(@Nullable Boolean accessKeyEncryptedStorage) {
            this.accessKeyEncryptedStorage = accessKeyEncryptedStorage;
            return this;
        }
        @CustomType.Setter
        public Builder adcTitle(@Nullable String adcTitle) {
            this.adcTitle = adcTitle;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMethod(@Nullable String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMethodTitle(@Nullable String authenticationMethodTitle) {
            this.authenticationMethodTitle = authenticationMethodTitle;
            return this;
        }
        @CustomType.Setter
        public Builder awsAccessKeyId(@Nullable String awsAccessKeyId) {
            this.awsAccessKeyId = awsAccessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder awsAccessKeyVersionGuid(@Nullable String awsAccessKeyVersionGuid) {
            this.awsAccessKeyVersionGuid = awsAccessKeyVersionGuid;
            return this;
        }
        @CustomType.Setter
        public Builder awsHost(@Nullable String awsHost) {
            this.awsHost = awsHost;
            return this;
        }
        @CustomType.Setter
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        @CustomType.Setter
        public Builder awsSecretAccessKey(@Nullable String awsSecretAccessKey) {
            this.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }
        @CustomType.Setter
        public Builder awsService(@Nullable String awsService) {
            this.awsService = awsService;
            return this;
        }
        @CustomType.Setter
        public Builder country(@Nullable String country) {
            this.country = country;
            return this;
        }
        @CustomType.Setter
        public Builder customSignStrings(@Nullable List<String> customSignStrings) {
            this.customSignStrings = customSignStrings;
            return this;
        }
        public Builder customSignStrings(String... customSignStrings) {
            return customSignStrings(List.of(customSignStrings));
        }
        @CustomType.Setter
        public Builder directConnectGeo(@Nullable String directConnectGeo) {
            this.directConnectGeo = directConnectGeo;
            return this;
        }
        @CustomType.Setter
        public Builder encodingVersion(@Nullable Integer encodingVersion) {
            this.encodingVersion = encodingVersion;
            return this;
        }
        @CustomType.Setter
        public Builder gcsAccessKeyVersionGuid(@Nullable String gcsAccessKeyVersionGuid) {
            this.gcsAccessKeyVersionGuid = gcsAccessKeyVersionGuid;
            return this;
        }
        @CustomType.Setter
        public Builder gcsHmacKeyAccessId(@Nullable String gcsHmacKeyAccessId) {
            this.gcsHmacKeyAccessId = gcsHmacKeyAccessId;
            return this;
        }
        @CustomType.Setter
        public Builder gcsHmacKeySecret(@Nullable String gcsHmacKeySecret) {
            this.gcsHmacKeySecret = gcsHmacKeySecret;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder mslkey(@Nullable String mslkey) {
            this.mslkey = mslkey;
            return this;
        }
        @CustomType.Setter
        public Builder mslname(@Nullable String mslname) {
            this.mslname = mslname;
            return this;
        }
        @CustomType.Setter
        public Builder nonce(@Nullable String nonce) {
            this.nonce = nonce;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder useCustomSignString(@Nullable Boolean useCustomSignString) {
            this.useCustomSignString = useCustomSignString;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginCharacteristics build() {
            final var o = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCharacteristics();
            o.accessKeyEncryptedStorage = accessKeyEncryptedStorage;
            o.adcTitle = adcTitle;
            o.authenticationMethod = authenticationMethod;
            o.authenticationMethodTitle = authenticationMethodTitle;
            o.awsAccessKeyId = awsAccessKeyId;
            o.awsAccessKeyVersionGuid = awsAccessKeyVersionGuid;
            o.awsHost = awsHost;
            o.awsRegion = awsRegion;
            o.awsSecretAccessKey = awsSecretAccessKey;
            o.awsService = awsService;
            o.country = country;
            o.customSignStrings = customSignStrings;
            o.directConnectGeo = directConnectGeo;
            o.encodingVersion = encodingVersion;
            o.gcsAccessKeyVersionGuid = gcsAccessKeyVersionGuid;
            o.gcsHmacKeyAccessId = gcsHmacKeyAccessId;
            o.gcsHmacKeySecret = gcsHmacKeySecret;
            o.locked = locked;
            o.mslkey = mslkey;
            o.mslname = mslname;
            o.nonce = nonce;
            o.secretKey = secretKey;
            o.templateUuid = templateUuid;
            o.useCustomSignString = useCustomSignString;
            o.uuid = uuid;
            return o;
        }
    }
}