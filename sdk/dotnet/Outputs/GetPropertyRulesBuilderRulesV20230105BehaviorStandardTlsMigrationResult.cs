// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorStandardTlsMigrationResult
    {
        public readonly bool? AllowHttpsDowngrade;
        public readonly bool? AllowHttpsUpgrade;
        public readonly int? CacheSharingDuration;
        public readonly string? CacheSharingStartTime;
        public readonly bool? Enabled;
        public readonly bool? IsCertificateSniOnly;
        public readonly bool? IsTieredDistributionUsed;
        public readonly bool? Locked;
        public readonly int? MigrationDuration;
        public readonly string? MigrationFrom;
        public readonly string? MigrationStartTime;
        public readonly string? TdLocation;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorStandardTlsMigrationResult(
            bool? allowHttpsDowngrade,

            bool? allowHttpsUpgrade,

            int? cacheSharingDuration,

            string? cacheSharingStartTime,

            bool? enabled,

            bool? isCertificateSniOnly,

            bool? isTieredDistributionUsed,

            bool? locked,

            int? migrationDuration,

            string? migrationFrom,

            string? migrationStartTime,

            string? tdLocation,

            string? templateUuid,

            string? uuid)
        {
            AllowHttpsDowngrade = allowHttpsDowngrade;
            AllowHttpsUpgrade = allowHttpsUpgrade;
            CacheSharingDuration = cacheSharingDuration;
            CacheSharingStartTime = cacheSharingStartTime;
            Enabled = enabled;
            IsCertificateSniOnly = isCertificateSniOnly;
            IsTieredDistributionUsed = isTieredDistributionUsed;
            Locked = locked;
            MigrationDuration = migrationDuration;
            MigrationFrom = migrationFrom;
            MigrationStartTime = migrationStartTime;
            TdLocation = tdLocation;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}