// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105CriterionUserLocationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("checkIps")]
        public Input<string>? CheckIps { get; set; }

        [Input("continentValues")]
        private InputList<string>? _continentValues;
        public InputList<string> ContinentValues
        {
            get => _continentValues ?? (_continentValues = new InputList<string>());
            set => _continentValues = value;
        }

        [Input("countryValues")]
        private InputList<string>? _countryValues;
        public InputList<string> CountryValues
        {
            get => _countryValues ?? (_countryValues = new InputList<string>());
            set => _countryValues = value;
        }

        [Input("field")]
        public Input<string>? Field { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("matchOperator")]
        public Input<string>? MatchOperator { get; set; }

        [Input("regionValues")]
        private InputList<string>? _regionValues;
        public InputList<string> RegionValues
        {
            get => _regionValues ?? (_regionValues = new InputList<string>());
            set => _regionValues = value;
        }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("useOnlyFirstXForwardedForIp")]
        public Input<bool>? UseOnlyFirstXForwardedForIp { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105CriterionUserLocationInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105CriterionUserLocationInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105CriterionUserLocationInputArgs();
    }
}