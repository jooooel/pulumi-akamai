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
    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameterResult
    {
        public readonly bool? EscapeValue;
        public readonly bool? Locked;
        public readonly int? LowerBound;
        public readonly bool? MatchCaseSensitiveName;
        public readonly bool? MatchCaseSensitiveValue;
        public readonly string? MatchOperator;
        public readonly bool? MatchWildcardName;
        public readonly bool? MatchWildcardValue;
        public readonly string? ParameterName;
        public readonly string? TemplateUuid;
        public readonly int? UpperBound;
        public readonly string? Uuid;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530CriterionQueryStringParameterResult(
            bool? escapeValue,

            bool? locked,

            int? lowerBound,

            bool? matchCaseSensitiveName,

            bool? matchCaseSensitiveValue,

            string? matchOperator,

            bool? matchWildcardName,

            bool? matchWildcardValue,

            string? parameterName,

            string? templateUuid,

            int? upperBound,

            string? uuid,

            ImmutableArray<string> values)
        {
            EscapeValue = escapeValue;
            Locked = locked;
            LowerBound = lowerBound;
            MatchCaseSensitiveName = matchCaseSensitiveName;
            MatchCaseSensitiveValue = matchCaseSensitiveValue;
            MatchOperator = matchOperator;
            MatchWildcardName = matchWildcardName;
            MatchWildcardValue = matchWildcardValue;
            ParameterName = parameterName;
            TemplateUuid = templateUuid;
            UpperBound = upperBound;
            Uuid = uuid;
            Values = values;
        }
    }
}
