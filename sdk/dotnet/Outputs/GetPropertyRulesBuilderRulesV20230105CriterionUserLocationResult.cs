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
    public sealed class GetPropertyRulesBuilderRulesV20230105CriterionUserLocationResult
    {
        public readonly string? CheckIps;
        public readonly ImmutableArray<string> ContinentValues;
        public readonly ImmutableArray<string> CountryValues;
        public readonly string? Field;
        public readonly bool? Locked;
        public readonly string? MatchOperator;
        public readonly ImmutableArray<string> RegionValues;
        public readonly string? TemplateUuid;
        public readonly bool? UseOnlyFirstXForwardedForIp;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105CriterionUserLocationResult(
            string? checkIps,

            ImmutableArray<string> continentValues,

            ImmutableArray<string> countryValues,

            string? field,

            bool? locked,

            string? matchOperator,

            ImmutableArray<string> regionValues,

            string? templateUuid,

            bool? useOnlyFirstXForwardedForIp,

            string? uuid)
        {
            CheckIps = checkIps;
            ContinentValues = continentValues;
            CountryValues = countryValues;
            Field = field;
            Locked = locked;
            MatchOperator = matchOperator;
            RegionValues = regionValues;
            TemplateUuid = templateUuid;
            UseOnlyFirstXForwardedForIp = useOnlyFirstXForwardedForIp;
            Uuid = uuid;
        }
    }
}
