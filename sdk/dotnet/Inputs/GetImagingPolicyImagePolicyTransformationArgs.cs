// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("appends")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationAppendInputArgs>? _appends;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationAppendInputArgs> Appends
        {
            get => _appends ?? (_appends = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationAppendInputArgs>());
            set => _appends = value;
        }

        [Input("aspectCrops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationAspectCropInputArgs>? _aspectCrops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationAspectCropInputArgs> AspectCrops
        {
            get => _aspectCrops ?? (_aspectCrops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationAspectCropInputArgs>());
            set => _aspectCrops = value;
        }

        [Input("backgroundColors")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationBackgroundColorInputArgs>? _backgroundColors;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationBackgroundColorInputArgs> BackgroundColors
        {
            get => _backgroundColors ?? (_backgroundColors = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationBackgroundColorInputArgs>());
            set => _backgroundColors = value;
        }

        [Input("blurs")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationBlurInputArgs>? _blurs;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationBlurInputArgs> Blurs
        {
            get => _blurs ?? (_blurs = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationBlurInputArgs>());
            set => _blurs = value;
        }

        [Input("chromaKeys")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationChromaKeyInputArgs>? _chromaKeys;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationChromaKeyInputArgs> ChromaKeys
        {
            get => _chromaKeys ?? (_chromaKeys = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationChromaKeyInputArgs>());
            set => _chromaKeys = value;
        }

        [Input("composites")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeInputArgs>? _composites;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeInputArgs> Composites
        {
            get => _composites ?? (_composites = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeInputArgs>());
            set => _composites = value;
        }

        [Input("compounds")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompoundInputArgs>? _compounds;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompoundInputArgs> Compounds
        {
            get => _compounds ?? (_compounds = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompoundInputArgs>());
            set => _compounds = value;
        }

        [Input("contrasts")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationContrastInputArgs>? _contrasts;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationContrastInputArgs> Contrasts
        {
            get => _contrasts ?? (_contrasts = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationContrastInputArgs>());
            set => _contrasts = value;
        }

        [Input("crops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCropInputArgs>? _crops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCropInputArgs> Crops
        {
            get => _crops ?? (_crops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCropInputArgs>());
            set => _crops = value;
        }

        [Input("faceCrops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationFaceCropInputArgs>? _faceCrops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationFaceCropInputArgs> FaceCrops
        {
            get => _faceCrops ?? (_faceCrops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationFaceCropInputArgs>());
            set => _faceCrops = value;
        }

        [Input("featureCrops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs>? _featureCrops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs> FeatureCrops
        {
            get => _featureCrops ?? (_featureCrops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs>());
            set => _featureCrops = value;
        }

        [Input("fitAndFills")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationFitAndFillInputArgs>? _fitAndFills;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationFitAndFillInputArgs> FitAndFills
        {
            get => _fitAndFills ?? (_fitAndFills = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationFitAndFillInputArgs>());
            set => _fitAndFills = value;
        }

        [Input("goops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationGoopInputArgs>? _goops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationGoopInputArgs> Goops
        {
            get => _goops ?? (_goops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationGoopInputArgs>());
            set => _goops = value;
        }

        [Input("grayscales")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationGrayscaleInputArgs>? _grayscales;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationGrayscaleInputArgs> Grayscales
        {
            get => _grayscales ?? (_grayscales = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationGrayscaleInputArgs>());
            set => _grayscales = value;
        }

        [Input("hsls")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationHslInputArgs>? _hsls;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationHslInputArgs> Hsls
        {
            get => _hsls ?? (_hsls = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationHslInputArgs>());
            set => _hsls = value;
        }

        [Input("hsvs")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationHsvInputArgs>? _hsvs;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationHsvInputArgs> Hsvs
        {
            get => _hsvs ?? (_hsvs = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationHsvInputArgs>());
            set => _hsvs = value;
        }

        [Input("ifDimensions")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationIfDimensionInputArgs>? _ifDimensions;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationIfDimensionInputArgs> IfDimensions
        {
            get => _ifDimensions ?? (_ifDimensions = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationIfDimensionInputArgs>());
            set => _ifDimensions = value;
        }

        [Input("ifOrientations")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationIfOrientationInputArgs>? _ifOrientations;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationIfOrientationInputArgs> IfOrientations
        {
            get => _ifOrientations ?? (_ifOrientations = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationIfOrientationInputArgs>());
            set => _ifOrientations = value;
        }

        [Input("imQueries")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationImQueryInputArgs>? _imQueries;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationImQueryInputArgs> ImQueries
        {
            get => _imQueries ?? (_imQueries = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationImQueryInputArgs>());
            set => _imQueries = value;
        }

        [Input("maxColors")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationMaxColorInputArgs>? _maxColors;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationMaxColorInputArgs> MaxColors
        {
            get => _maxColors ?? (_maxColors = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationMaxColorInputArgs>());
            set => _maxColors = value;
        }

        [Input("mirrors")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationMirrorInputArgs>? _mirrors;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationMirrorInputArgs> Mirrors
        {
            get => _mirrors ?? (_mirrors = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationMirrorInputArgs>());
            set => _mirrors = value;
        }

        [Input("monoHues")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationMonoHueInputArgs>? _monoHues;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationMonoHueInputArgs> MonoHues
        {
            get => _monoHues ?? (_monoHues = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationMonoHueInputArgs>());
            set => _monoHues = value;
        }

        [Input("opacities")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationOpacityInputArgs>? _opacities;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationOpacityInputArgs> Opacities
        {
            get => _opacities ?? (_opacities = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationOpacityInputArgs>());
            set => _opacities = value;
        }

        [Input("regionOfInterestCrops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropInputArgs>? _regionOfInterestCrops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropInputArgs> RegionOfInterestCrops
        {
            get => _regionOfInterestCrops ?? (_regionOfInterestCrops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropInputArgs>());
            set => _regionOfInterestCrops = value;
        }

        [Input("relativeCrops")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationRelativeCropInputArgs>? _relativeCrops;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationRelativeCropInputArgs> RelativeCrops
        {
            get => _relativeCrops ?? (_relativeCrops = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationRelativeCropInputArgs>());
            set => _relativeCrops = value;
        }

        [Input("removeColors")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs>? _removeColors;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs> RemoveColors
        {
            get => _removeColors ?? (_removeColors = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs>());
            set => _removeColors = value;
        }

        [Input("resizes")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationResizeInputArgs>? _resizes;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationResizeInputArgs> Resizes
        {
            get => _resizes ?? (_resizes = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationResizeInputArgs>());
            set => _resizes = value;
        }

        [Input("rotates")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationRotateInputArgs>? _rotates;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationRotateInputArgs> Rotates
        {
            get => _rotates ?? (_rotates = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationRotateInputArgs>());
            set => _rotates = value;
        }

        [Input("scales")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationScaleInputArgs>? _scales;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationScaleInputArgs> Scales
        {
            get => _scales ?? (_scales = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationScaleInputArgs>());
            set => _scales = value;
        }

        [Input("shears")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationShearsInputArgs>? _shears;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationShearsInputArgs> Shears
        {
            get => _shears ?? (_shears = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationShearsInputArgs>());
            set => _shears = value;
        }

        [Input("trims")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationTrimInputArgs>? _trims;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationTrimInputArgs> Trims
        {
            get => _trims ?? (_trims = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationTrimInputArgs>());
            set => _trims = value;
        }

        [Input("unsharpMasks")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationUnsharpMaskInputArgs>? _unsharpMasks;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationUnsharpMaskInputArgs> UnsharpMasks
        {
            get => _unsharpMasks ?? (_unsharpMasks = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationUnsharpMaskInputArgs>());
            set => _unsharpMasks = value;
        }

        public GetImagingPolicyImagePolicyTransformationInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationInputArgs Empty => new GetImagingPolicyImagePolicyTransformationInputArgs();
    }
}